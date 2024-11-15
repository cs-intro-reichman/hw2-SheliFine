public class TimeCalc {
    public static void main(String[] args) {
        char var10000 = args[0].charAt(0);
        int var1 = Integer.parseInt("" + var10000 + args[0].charAt(1));
        var10000 = args[0].charAt(3);
        int var2 = Integer.parseInt("" + var10000 + args[0].charAt(4));

        int MinutesToAdd = Integer.parseInt(args[1]);
// calculate the new time with added minutes
        int TotalMinutes = var1 * 60 + var2 + MinutesToAdd;
        int TotalHours = TotalMinutes / 60;
        int NewHour = TotalHours % 24;
        int NewMinutes = TotalMinutes - TotalHours * 60;

    // prints the time considering adding 0 to the output for the right time format

        if (NewHour > 9) {
            if (NewMinutes > 9){
                System.out.println(NewHour + ":" + NewMinutes);
            } else {
                System.out.println(NewHour + ":0" + NewMinutes);
            }
        } else {
            if (NewMinutes > 9){
                System.out.println("0" + NewHour + ":" + NewMinutes);
        } else {
            System.out.println("0" + NewHour + ":0" + NewMinutes);
        }
    }
}  
}  

  
  