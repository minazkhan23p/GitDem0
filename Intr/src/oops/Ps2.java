package oops;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Ps2 extends Ps3 {
	int a;

public Ps2(int a,int b) {
	super(b);
	this.a =a;

		// TODO Auto-generated constructor stub
	}

public int add() {
	a=a+1;
	return a;
}

public int subtract() {
	a=a-1;
	return a;
}

}
