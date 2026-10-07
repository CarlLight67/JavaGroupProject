public static void main(String[] args) {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    while(true){

        try{
            while(true){
            System.out.print("INPUT YOUR NAME: ");
            String name = input.readLine().trim();

            if(name.isEmpty()){
                continue;

            }else{
            System.out.printf("YOUR NAME IS %s%n", name);
             break;
            }
            }

            while(true){
                System.out.print("enter your age: ");
                String raw = input.readLine().trim();
                if(raw.isEmpty()){
                    continue;
                }
                int age = Integer.parseInt(raw);
                System.out.println("Age: " + age);
                break;
            }

        }catch(Exception e){

        }

    }
}