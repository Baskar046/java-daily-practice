
public class FindDuplicateChar {

    public static void main(String[] args){

        String Input = "programming";

        boolean[] check = new boolean[Input.length()];

        int count;

        for(int i=0; i<Input.length(); i++){

            count =0;
            char ch = Input.charAt(i);

            if(check[i]){
                continue;
            }

            for(int j=0; j<Input.length(); j++){

                char cha = Input.charAt(j);
                if(ch == cha){
                    count++;
                    check[j]=true;

                }
            }

           if(count>1){
               System.out.println(ch);
           }
        }
    }

}
