
void setup() {
 size(500,500);
  // set the size of your sketch
}

int x = 250;
int y = 250;
int a = 1;
int b = 1;
 void draw() {

  for (int z = 0; z < 10; z++) {
    fill(#F0336F);
    ellipse(x,y, 300,300);
  
  if (z % 2 == 0) {
    fill(#545DE8);
    ellipse(x,y, 300-a*z,300-b*z);
  }
  }

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
