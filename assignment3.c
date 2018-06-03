#include <stdio.h>
#include <stdlib.h>

#define SIZE 50

int main(){
     
    int array[SIZE][SIZE] = {0};                      // Array's all values are assigned as a '0'.
    int size = 0, cars = 0;                           
    int x = 0, y = 0, a = 0, b = 0;                   // Grid's variables.
    int i = 0, j = 0, k = 0, m = 0, n = 0;            // Loops variables.
    int bestSlot = 0;                                   
    int total = 0, sum = 0;                           // Total is a distance for each '0' slot and position has a car parked. Sum is a distance for all positons have car parked and each '0' slot.
    int first = 0, second = 0;                        // "X" and "Y" distance between slot and nearest car. 
    int flag = 0, counter = 0;                                     // Control flag.
    int nearX = 0, nearY = 0;

    printf("Size: ");                                 // Input part to take the values of size and numbers of cars. 
    scanf("%d", &size);

    while(size > 50){                                 // Loop for checking the size of array.
        printf("Size must be between 50 and 1\n");
        printf("Size: ");                              
        scanf("%d", &size);
    }
    printf("Cars: ");                                 // Input part to take the values of size and numbers of cars.
    scanf("%d", &cars);

    if(cars > (size * size)){                         // Error checking if the numbers of the cars exceeds the size * size (capacity of the cars)
        return 0;
    }
    if(cars == (size*size)){                          // Error checking for both cars and capacicy are equal.
        printf("Best Slot Found In: 0 0\n");
        return 0;
    }
    if(cars == 0){                                    // If there is not any car directly we choose the slot as a "1 1".
        printf("Best Slot Found In: 1 1\n");
        return 0;
    }
    for(i = 0 ; i < cars; i++){                       // This part takes the x and y value to make it's grid '-1',otherwise '0'.
            
        printf("Locations: ");
        scanf("%d%d", &x, &y);                        

        if(((x > size || x < 1) || (y > size || y < 1))){      
            counter++;
        }
        for(j = size-1; j >= 0; j--){
            for(k = 0; k < size; k++){
                if(j == y-1 && k == x-1){             // In this part I substract 1 from both x and y values because our x and y values are starting from '1' not '0'. 
                    array[j][k] = -1;                  
                }                                     // If I enter "1 1" in my array means in normal array "0 0". 
            }
        }
    }
    if(cars == counter){     
            printf("Best Slot Found In: 1 1\n");      // Error checking for cars input equals invalid x or y values.
            return 0;
    }
    for(j = size-1; j >= 0; j--){                     // This for loop calculates the Manhatten Distance for all '0' slot.
        for(k = 0; k < size; k++){

            if(array[j][k] == 0){
                
                for(m = size-1; m >= 0; m--){
                    for(n = 0; n < size; n++){
                        
                        if(array[m][n] == -1){

                            first = j - m;
                            second = k - n;
                            
                            if(first < 0){            // If statements are used to take absolute values for distances(first and second).
                                first *= -1;
                            }
                            if(second < 0){
                                second *= -1;
                            }
                            
                            total = first + second;

                            if(flag == 0){            // This part determines the nearest car coordinates.
                                sum = total;
                                flag = 1;
                                nearX = n;
                                nearY = m;
                            }
                            if(total <= sum){       
                                sum = total;
                                nearX = n;
                                nearY = m;   
                            }
                        }
                    }
                }
                flag = 0;                             // This part assigned the value of distance that is between each slot and nearest car.
                first = j - nearY;                   
                second = k - nearX;                   // First is value of "y-y1", Second is value of "x-x1" between nearest car and first "0"
                            
                if(first < 0){                        // slot by using Manhattan Distance.
                    first *= -1;
                }
                if(second < 0){
                    second *= -1;
                }
                total = first + second;
                array[j][k] = total;
            }
        }
    }
    for(j = size-1; j >= 0; j--){                     // This loop controls the if the two points's Manhattan Distances are same it compares
        for(k = 0; k < size; k++){                                                                 
            if(array[j][k] > bestSlot){               // x values first then choose the point that includes small x value if their x values are same                       
                bestSlot = array[j][k];
                a = k;                                // also it compares the y values then choose the point that includes small y values.
                b = j;
            }
            else if(array[j][k] == bestSlot){
                if(k < a){
                    bestSlot = array[j][k];
                    a = k;
                    b = j;
                }
                else if(k == a && j < b){
                    bestSlot = array[j][k];
                    a = k;
                    b = j;
                }
            }
        }
    }    
    printf("Best Slot Found In: %d %d\n", a + 1, b + 1); // We add "1" for x and y values because we had substracted "1" from each values.
    
    return EXIT_SUCCESS;
}
