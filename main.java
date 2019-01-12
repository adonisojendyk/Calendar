import javax.swing.JOptionPane;

public class FiveTwentyNine {
    public static void main(String[] args) {
        
        String yearinput = JOptionPane.showInputDialog("Enter a year: ");
        int year = Integer.parseInt(yearinput);
        
        String dotwinput = JOptionPane.showInputDialog("What day of the week would you like to start on? (0 = Sunday; 1 = Monday; etc.)");
        int day = Integer.parseInt(dotwinput);
        
        int months = 0;
        String month = "";
        String startday = "";
        int sevendays = 0;
        int namemonth = 0;
        int febdays = 0;
        
        boolean isLeapYear = (year % 4 == 0 && 100 != 0) || (year % 400 == 0);
        
        while(months < 12){       
        if(day == 0){
            startday = "";
        }
         if(day == 1) {
            startday = "\t";
        }
        else if(day == 2){
            startday = "\t\t";
        }
        else if(day == 3){
            startday = "\t\t\t";
        }
        else if(day == 4){
            startday = "\t\t\t\t";
        }
        else if(day == 5){
            startday = "\t\t\t\t\t";
        }
        else if(day == 6){
            startday = "\t\t\t\t\t\t";
        }
         
            namemonth++;
            months++;
            if(namemonth == 1){
                month = "January";
            }
            else if(namemonth ==2){
                month = "February";
            }
            else if(namemonth ==3){
                month = "March";
            }
            else if(namemonth ==4){
                month = "April";
            }
            else if(namemonth == 5){
                month = "May";
            }
            else if(namemonth == 6){
                month = "June";
            }
            else if(namemonth == 7){
                month = "July";
            }
            else if(namemonth == 8){
                month = "August";
            }
            else if(namemonth == 9){
                month = "September";
            }
            else if(namemonth == 10){
                month = "October";
            }
            else if(namemonth == 11){
                month = "November";
            }
            else if(namemonth == 12){
                month = "December";
            }

            int num = 0;
        System.out.println("\n\t\t"+ month +"\t" + year);
        System.out.println("----------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        //if(num == 0){
            //System.out.print(startday);
       //     num++;}
       
       if(namemonth > 1){
       if (sevendays == 0){
           startday = "";
       }else if(sevendays == 1){
           startday = "\t";
       }else if(sevendays == 2){
           startday = "\t\t";
       }else if (sevendays == 3){
           startday = "\t\t\t";
       }else if(sevendays == 4){
           startday = "\t\t\t\t";
       }else if(sevendays == 5){
           startday = "\t\t\t\t\t";
       }else if(sevendays == 6){
           startday = "\t\t\t\t\t\t";
       }}
       
          System.out.print(startday);
          if (namemonth == 1){
          sevendays = sevendays + day;
          }
          int daysinamonth = 0;
          int daynumbers = 0;
          
          if(namemonth == 2){
              if(isLeapYear == true){febdays = 29;}
        else {febdays = 28;}
            while(daysinamonth < febdays){
            sevendays++;
            daynumbers++;
            daysinamonth++;
            System.out.print(daynumbers + "\t");
            if(sevendays % 7 == 0){
                System.out.print("\n");
                sevendays = 0;}}}
        else if(namemonth == 4 || namemonth == 6 || namemonth == 9 || namemonth == 11){
            while(daysinamonth < 30){
            sevendays++;
            daynumbers++;
            daysinamonth++;
            System.out.print(daynumbers + "\t");
            if(sevendays % 7 == 0 ){
                System.out.print("\n");
                sevendays = 0;}}}
        else if(namemonth == 1 || namemonth == 3 || namemonth == 5 || namemonth == 7 || namemonth == 8 || namemonth == 10 || namemonth == 12){ 
             while(daysinamonth < 31){
            sevendays++;
            daynumbers++;
            daysinamonth++;
                 System.out.print(daynumbers + "\t");
            if(sevendays % 7 == 0){
                System.out.print("\n");
                sevendays = 0;}}}}}}
