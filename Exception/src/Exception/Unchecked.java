package Exception;

public class Unchecked {
public static void main(String[] args) {
	
	mom();
}


public static void mom()         {
	
	son();
}

public static void son() {
	
	throw new RuntimeException("ghghggh");
}
}

