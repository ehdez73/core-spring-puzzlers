package aop.example6;

public class DefaultUsageTracked implements UsageTracked {
	
	static int count= 0;

	public void incrementUseCount() {
		count++;
	}

	public int getCount() {
		return count;
	}

}
