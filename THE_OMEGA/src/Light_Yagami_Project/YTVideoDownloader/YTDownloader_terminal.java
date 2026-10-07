package Light_Yagami_Project.YTVideoDownloader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class YTDownloader_terminal {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String playlistUrl = "";
        String outputDirectory = "";

        banner();

        while (true) {
            System.out.print("INPUT THE URL OF THE YOUTUBE VIDEO/PLAYLIST: ");
            playlistUrl = input.readLine().trim();

            if (!playlistUrl.isEmpty()) {
                break;
            }
        }

        while (true) {
            System.out.print("Enter the location: ");
            outputDirectory = input.readLine().trim();

            if (outputDirectory.isEmpty()) {
                continue;
            }

            File dir = new File(outputDirectory);
            if (!dir.exists()) {
                try {
                    Files.createDirectories(Paths.get(outputDirectory));
                    System.out.println("Directory created: " + outputDirectory);
                    break;
                } catch (IOException e) {
                    System.out.println("ERROR: Cannot create directory: " + e.getMessage());
                    continue;
                }
            } else if (dir.isDirectory()) {
                break;
            } else {
                System.out.println("ERROR: This path is not a directory.");
            }
        }

        // Get yt-dlp.exe path from user
        String ytDlpPath = "";
        while (true) {
            System.out.print("ENTER THE LOCATION OF THE [ yt-dlp.exe ] : ");
            ytDlpPath = input.readLine().trim();

            if (ytDlpPath.isEmpty()) {
                System.out.println("MUST INPUT LOCATION OF THE FILE . TRY AGAIN!!!");
                continue;
            }

            File ytDlpFile = new File(ytDlpPath);
            if (!ytDlpFile.exists()) {
                System.out.println("ERROR: File not found at: " + ytDlpPath);
                continue;
            }

            break;
        }

        String[] command = {
                ytDlpPath,
                "-f", "bv*+ba/b",
                "--merge-output-format", "mp4",
                "-o", "%(playlist_index)02d - %(title)s.%(ext)s",
                playlistUrl
        };

        try {
            ProcessBuilder pb = new ProcessBuilder(command);
            pb.directory(new File(outputDirectory));
            pb.redirectErrorStream(true);

            System.out.println("Starting download...");
            Process process = pb.start();

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))) {

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("\nPlaylist downloaded successfully!");
            } else {
                System.err.println("\nDownload failed with exit code: " + exitCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void banner() {
        System.out.println("\u001B[92m" + """
                ====================================================================================================================================================
                                
                     .-:.     ::-.:::::::::::::::::::-.      ...    .::    .   .::::::.    :::. :::         ...       :::.   :::::::-.  .,:::::: :::::::..  
                      ';;.   ;;;;';;;;;;;;'''' ;;,   `';, .;;;;;;;. ';;,  ;;  ;;;' `;;;;,  `;;; ;;;      .;;;;;;;.    ;;`;;   ;;,   `';,;;;;'''' ;;;;``;;;; 
                        '[[,[[['       [[      `[[     [[,[[     \\[[,'[[, [[, [['    [[[[[. '[[ [[[     ,[[     \\[[, ,[[ '[[, `[[     [[ [[cccc   [[[,/[[[' 
                          c$$"         $$       $$,    $$$$$,     $$$  Y$c$$$c$P     $$$ "Y$c$$ $$'     $$$,     $$$c$$$cc$$$c $$,    $$ $$""\""   $$$$$$c   
                        ,8P"`          88,      888_,o8P'"888,_ _,88P   "88"888      888    Y88o88oo,.__"888,_ _,88P 888   888,888_,o8P' 888oo,__ 888b "88bo,
                       mM"             MMM      MMMMP"`    "YMMMMMP"     "M "M"      MMM     YM""\""YUMMM  "YMMMMMP"  YMM   ""` MMMMP"`   ""\""YUMMMMMMM   "W"
                
                \u001B[91m BY: LIGHT YAGAMI \u001B[91m                      GITHUB: https://github.com/CarlLight67/                  FB: https://www.facebook.com/CarlDictaan/
                \u001B[92m====================================================================================================================================================
                """ + "\u001B[92m");
    }
}