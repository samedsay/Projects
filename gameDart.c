#include <stdio.h>
#include <stdlib.h>

int pointFun(int points, char ring);                              // Function prototypes that I defined.
int resultFun(int points, char ring, int segment);

int main(){

    int target = 0, segment = 0, points = 0;
    char ring = '\n';

    printf("Target: ");
    scanf("%d",&target);
    printf("\n");
    points = target;
    points = resultFun(points, ring, segment);
    printf("Points: %d\n",points);
   
    return EXIT_SUCCESS;
}
int pointFun(int segment, char ring){                             // Function that calculates the throw value with parameters are called segment and ring.

    int sum = 0;
    
    if(ring == 'D'){

        sum += (segment * 2);
    }
    else if(ring == 'T'){

        sum += (segment * 3);
    }
    else if(ring == 'S'){

        sum += segment;
    }
    else if(ring == 'O'){

        sum += 25;
    }
    else if(ring == 'I'){

        sum += 50;
    }

    return sum;
}

int resultFun(int points, char ring, int segment){              // Function that takes the current point then call the pointFun function to calculate the

    int throwValue = 0;                                         // throw value for substructing if the throw value is valid according the rules. If it is

    while(points != 0){                                         // valid then the new point will be determined.

        printf("Throw: ");                                      // First while loop controls the first ring is 'D' or not. If the ring is 'D', loop will be
        scanf("%d %c",&segment, &ring);
                                                                // broken.
        if(ring != 'D'){

            printf("Points: %d\n",points);
        }
        else{

            break;
        }
    }
    throwValue = pointFun(segment, ring);
    points -= throwValue;

    while(points != 0){                                         // This while loop controls the throw value is valid or not.

        if(points == 0 && ring == 'D'){

            printf("Points: %d\n",points);
        }

        else if(points > 1){

            printf("Points: %d\n",points);
            printf("Throw: ");
            scanf("%d %c",&segment, &ring);
            throwValue = pointFun(segment, ring);
        
            while(throwValue > points || (points - throwValue == 1) || (points-throwValue == 0 && ring != 'D')){

                printf("Points: %d\n",points);
                printf("Throw: ");
                scanf("%d %c",&segment, &ring);
                throwValue = pointFun(segment, ring);
            }
            points -= throwValue;
        }

        else {

            printf("Points: %d\n",points);

            while(points != 0){

                printf("Throw: ");
                scanf("%d %c",&segment, &ring);

                if(ring != 'D'){

                    printf("Points: %d\n",points);
                }

                else{

                    break;
                }
            }
        }
    }
    return points;
}
