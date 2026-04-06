class NPTEL_W2 {
int x;
NPTEL_W2(int x) {
this.x = x+1;
}
void printX() {
System.out.println(this.x);
}
public static void main(String[] args) {
NPTEL_W2 obj = new NPTEL_W2(100);
obj.printX();
}}

// The constructor NPTEL_W2 (int x) ini�alizes the instance variable x with the value passed as an
// argument. The method printX() prints the value of x, which is 101. Refer to Lecture 7 for more
// details.