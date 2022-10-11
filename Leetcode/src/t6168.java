import java.math.BigInteger;

public class t6168 {
	public int numberOfWays(int startPos, int endPos, int k) {
		if(k % 2 != (Math.abs(endPos - startPos)) % 2){
			System.out.println("输出0");
			return 0;
		}
		if(Math.abs(endPos - startPos) > k){
			return 0;
		}

		return f(k, (k - (endPos - startPos)) / 2);
    }

	int f(int a, int b){
		BigInteger res = BigInteger.valueOf(1);
		for (int i = 0; i < b; i++) {
			BigInteger tmp = BigInteger.valueOf(a - i);
			res = res.multiply(tmp);
		}
		for (int i = 1; i <= b; i++) {
			BigInteger tmp = BigInteger.valueOf(i);
			res = res.divide(tmp);
		}

		res = res.mod(BigInteger.valueOf(1000000007));
		//System.out.println(c);

		System.out.println("输出组合数");
		return res.intValue();
	}

}
