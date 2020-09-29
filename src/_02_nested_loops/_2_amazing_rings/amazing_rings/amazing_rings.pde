
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */

int x = 500;
int y = 350;
int wh = 500;
int speed = 12;
void setup() {
 
  // set the size of your sketch
  size(2000,700);
  background(#FFFFFF);
  
}

void draw() {
  background(#FFFFFF);
  noFill();
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0; i < 6; i++) {
    noFill();
    ellipse(x,y,wh,wh);
    wh-=80;
  }
wh=500;

x+=speed;
if(x>=2000)  {
  speed= -speed;
}
if(x<=0)  {
  speed= -speed;
}
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
