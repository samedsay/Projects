#include <stdio.h>                                                     //Standard Input and Output Header to use "printf" and "scanf"

int main(){                                             

    int year = 0, month = 0, day = 0, endYear = 0;
    int j = 0, k = 0, m = 0, q = 0;
    int dayCounter = 0, numberOfDay = 0;                               //dayCounter is used for determining number of same days.
    int temporaryMonth = 0, temporaryYear = 0;                                              
    int congruenceOfZeler=0;
    int controlOfValidity = 1;                                         //Flag for specifying the "Invalid Date".

    printf("Enter date [year month day]: ");
    scanf("%d %d %d",&year,&month,&day);

    if(year < 0 || month <= 0 || month > 12 || day <= 0 || day > 31){        
        
        controlOfValidity = 0;
    }
    else if(month == 2 && day > 28){

        controlOfValidity = 0;                                        // If and else conditions are used for stating
    }                                                                                           
    else if(month == 4 && day > 30 ){                                 // invalid conditions by shifting value of 
        
        controlOfValidity = 0;                                        // controlOfValidity flag from '1' to '0'.
    }
    else if(month == 6 && day > 30){
   
        controlOfValidity = 0;
    }
    else if(month == 9 && day > 30){
        
        controlOfValidity = 0;
    }
    else if(month == 11 && day > 30){

        controlOfValidity = 0;
    }

    while(controlOfValidity == 0){                                    // If the flag is shifted, while loop will be

        printf("Invalid date.\n");                                    // processed and will print "Invalid date." 

        return 1;                                                     // with "return 1;" value.
    }

    int lastMonth = month;                                            // This assignment is used for printing  

    while(controlOfValidity){                                         // the year is after entering year in the statement.
    
        printf("Enter end year: ");                                   
        scanf("%d",&endYear);
                                                                       
        if(endYear < year + 2){                                      //Checking end year is valid or not.
                                                                      
            printf("Invalid date.\n");
            return 1; 
        }
                                                                      // If the flag value is not changed this while
        else if(month == 1 || month == 2){                            
                                                                      // loop will be processed then calculate the
            year--;
            month +=12;                                               // the result.

        }
    
        q = day;                                                    
        m = month;
        k = year % 100;
        j = (year-k)/100;
    
        temporaryMonth = month;
        temporaryYear = year;

        congruenceOfZeler = (q + (13 * (m +1) / 5) + k + (k / 4) + (j /  4) + (5 * j)) % 7;   
        numberOfDay = congruenceOfZeler;
                                                                     // numberOfDay is a variable to store the value of the day.
        switch(congruenceOfZeler){

            case 0:                                                  // Switch-case is used for writing the name of the day.
                printf("It's a Saturday.\n");
                break;
        
            case 1:
                printf("It's a Sunday.\n");
                break;
        
            case 2:
                printf("It's a Monday.\n");
                break;
        
            case 3:
                printf("It's a Tuesday.\n");
                break;
        
            case 4:
                printf("It's a Wednesday.\n");                     
                break;
       
            case 5:
                printf("It's a Thursday.\n");
                break;

            case 6:
                printf("It's a Friday.\n");
                break;
        }

        while (endYear - temporaryYear != 0){                     // While loop checking the same day-and-month on same weekday

            q = day;                                              // between the entering date's year and end year.
            m = month;
            k = temporaryYear % 100;
            j = (temporaryYear-k)/100;

            congruenceOfZeler = (q + (13 * (m +1) / 5) + k + (k / 4) + (j /  4) + (5 * j)) % 7;

            if(congruenceOfZeler == numberOfDay && month == temporaryMonth){

                dayCounter++;                                     // Same days have been counting.

            } 
        
            temporaryYear++;
        }
        --dayCounter;

        if(lastMonth < 3){                                       // Control the month is Jenuary or February. If it is; 

            year += 2;                                           // we add 2 because one is coming from the formula the other is for next year.
        }
        else{                                                      
                                                                 // If it is not we add one for only next year.
            year++;
        }

        printf("Same day-and-month on same weekday between %d and %d: %d\n", year, endYear, dayCounter);

        break;
    }

    return 0;
}
