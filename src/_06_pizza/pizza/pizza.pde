void setup(){
  size(800,500);
}

void draw(){
  PImage MySomewhatPizzaCode = loadImage("my somewhat pizza code.jpg");
  PImage Ebay = loadImage("ebay.jpg");
  PImage Dead = loadImage("dead.jpg");
  
  fill(#FF00D5);
  triangle(90,310,190,140,250,310);
  fill(250,0,0);
  triangle(100,300,190,150,240,300);
  MySomewhatPizzaCode.resize(60,60);
 Ebay.resize(60,60); 
 Dead.resize(60,60);
  image(MySomewhatPizzaCode, 150,150);
  image(Ebay, 130,220);
  image(Dead, 180,220);
}

//Creating values for pizza
// reorder pizza
