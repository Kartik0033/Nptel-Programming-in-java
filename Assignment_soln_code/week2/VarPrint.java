public class VarPrint {
int x = 30;
static int y = 20;
public static void main(String[] args) {
VarPrint t1 = new VarPrint();
t1.x = 99;
VarPrint.y = 88;
int z1 = t1.x + VarPrint.y;
VarPrint t2 = new VarPrint();
System.out.println(t2.x + " " + VarPrint.y + " " + z1);
}
}

// //If you perform any change for instance variable these changes won’t be reflected for the remaining
// objects. Because for every object a separate copy of instance variable will be there. But if you do any
// change to the sta�c variable, that change will be reflected for all objects because a sta�c instance
// maintains a single copy in memory.