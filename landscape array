PVector[] rain;
PVector[] rainspeed;
int x;
void setup(){
size(600, 600);

rain = new PVector[100];
rainspeed = new PVector[100];
for (int r = 0; r < rain.length; r++) {
  float x = random(0, width);
  float y = random(0, 150);
  rain[r] = new PVector(x, y);
  rainspeed[r] = new PVector(0, 0);
  }
}
void draw() {
//background
background(#8BCDF3);

    //sun
    noStroke();
    fill(#FDFD13);
    ellipse(width-100, 100, 75, 75);
  
  //ground
  noStroke();
  fill(#8B4513);
  rect(0, height-385, width, 385);
    
    //car
    fill(255, 0, 115);
    rect(x, 200, 100, 20);
    rect(x + 15, 178, 70, 40);
    
    //wheels
    fill(77, 66, 66);
    ellipse(x + 25, 221, 24, 24);
    ellipse(x + 75, 221, 24, 24);

x = x + 2;

// raindrops
for (int i = 0; i < rain.length; i++) {
  rain[i].add(0, 20);
  rain[i].add(rainspeed[i]);

if (rain[i].y > 600) {
  rain[i].y = - 75;
  rain[i].y = (int) random(0, 150);
}
noStroke();
fill(#1E90FF);
ellipse(rain[i].x, rain[i].y, 10, 20);

}
}
