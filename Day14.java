public class main {
  public static void main(String[] args) {
        String a = "12345";
        int b = Integer.parseInt(a);
        System.out.println("String kr Integer : "+ b);
        
        String c = "3.14";
        double d = Double.parseDouble(c);
        System.out.println("String ke Double : "+d);
        
        String e = "true";
        boolean f = Boolean.parseBoolean(e);
        System.out.println("String ke Boolean : "+f);
        
        String g = "12.3";
        float h = Float.parseFloat(g);
        System.out.println("String ke Float : "+h);
        
        String i = "A";
        char j = i.charAt(0);
        System.out.println("String ke char : "+j);
        
        String k = "1000000";
        long l = Long.parseLong(k);
        System.out.println("String ke Long : "+l);
        
        String m = "50";
        short n = Short.parseShort(m);
        System.out.println("String ke Short : "+n);
        
        String o = "20";
        byte p = Byte.parseByte(o);
        System.out.println("String ke Byte : "+p);
  }
}
