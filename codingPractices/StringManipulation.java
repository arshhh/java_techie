package codingPractices;

public class StringManipulation {
    public static void main(String[] args){
//        String s = "11:00:00PM";
//        System.out.println(s.substring(0,2));
//        String sub = (s.substring(0,2));
//        int a = Integer.parseInt(sub)+ 12;
//        System.out.println(a+s.substring(2,s.length()-2));

        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String palin = s.substring(0,1);
        for(int i=0; i<=s.length();i++){
            for(int j=i+1; j<=s.length();j++){
                StringBuilder s1 = new StringBuilder();
                s1.append(s.substring(i,j));
                s1.reverse();
                // System.out.println("String:"+s+" reverse:"+s1);
                if (s.substring(i,j).compareTo(s1.toString()) == 0 && palin.length() < s.substring(i,j).length()){
                    palin = s.substring(i,j);
                }

            }
        }
        System.out.println(palin);
    }
}
