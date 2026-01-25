public class C_player {
    static String country = "india";
    int score;

    void bat(){
            int score=29;
            float strike_rate=78.5f;
            System.out.println("Batting with "+score+" "+strike_rate);
        }

    void keep(){
        System.out.println("keeping...");
    }
    void bowl(){
        System.out.println("bowling...");
    }

    public static void main(String[] args) {
        C_player Dhoni = new C_player();
        C_player Rohit = new C_player();
        C_player Virat = new C_player();

        Dhoni.score=78;
        Virat.score=69;
        Rohit.score= 98;

        Dhoni.bat();
        Virat.bat();
        Rohit.bat();

        System.out.println(Dhoni.country);
        System.out.println(Dhoni.score);

    }
}
