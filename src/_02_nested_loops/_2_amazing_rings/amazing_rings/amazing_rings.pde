
  /*** Go to the recipe to run the demonstration before starting this program ***/
int x = 100;
int x2 = 800;
int speed = 1;
int speed2 = -speed;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(800, 600);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
background(#FFFFFF);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/          
int b =150;
for(int i=0; i<20; i++){
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */

 ellipse(x, 100, b, b);
 b=b-10;
}
x = x + speed;
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
if(x == 800 || x==0){
 speed = -speed; 
}
int a = 150;
for(int i=0; i<20; i++){
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */

 ellipse(x2, 100, a, a);
 a=a-10;
}
x2 = x2 + speed2;
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
if(x2 == 0 || x2==800){
 speed2 = -speed2; 
}
         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
