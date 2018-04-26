int x;

void setup() {
  size(600, 600);
}

//background
void draw() {
  background(#87CEFA);
  
  //ground
  noStroke();
  fill(#8B4513);
  rect(0, height-385, width, 385);
  
    //sun
    noStroke();
    fill(#FDFD13);
    ellipse(width-100, 100, 75, 75);
    
    //car  
    fill(255, 0, 115);
    rect(x, 200, 100, 20);
    rect(x + 15, 178, 70, 40);
    
    //wheels
    fill(77, 66, 66);
    ellipse(x + 25, 221, 24, 24);
    ellipse(x + 75, 221, 24, 24);
    
    x = x + 2;
}
