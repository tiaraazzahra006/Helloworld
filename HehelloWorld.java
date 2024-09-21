public class HehelloWorld {
    public static void main(String[] args) {
        //pertama buat i
        String words;
        words = "Hello world"; 
        @SuppressWarnings("unused")
        String[] strarray = words.split(" ");
        for(int i=0; i<words.length(); i++) {
                System.out.println(words.charAt(i));
        };
        
    }
}
