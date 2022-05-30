class Circle{
  public static void main(String[] args){
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;
    
    area = radius * radius * pi;
    
    //¬”“_‘æ‚RˆÊˆÈ~‚ğØ‚èÌ‚Ä
    area = (int)(area * 100);//intŒ^‚ÉƒLƒƒƒXƒg‚·‚é‚±‚Æ‚Å–³—‚â‚è¬”“_ˆÈ‰º‚ğØ‚èÌ‚Ä‚éB¡‰ñ‚Í¬”“_‘æ“ñˆÊ‚Ü‚Åc‚·‚Ì‚Å‚©‚¯‚é‚P‚O‚O‚µ‚Ä‚¢‚éB
    area = area /100;//‚©‚¯‚é‚P‚O‚O‚µ‚½‚à‚Ì‚ğŒ³‚É–ß‚·B
    System.out.println("”¼ŒaF" + radius);
    System.out.println("–ÊÏF" + area);
  }
}
