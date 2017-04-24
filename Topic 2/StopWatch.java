package demo;

public class StopWatch {
	
	private long startTime;
	private long endTime;
	private long elapsedPause;
	private int lastSecond = 0;

	private boolean start;
	private boolean stop;
	
	private int seconds;
	private int minutes;
	private int hours;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	public void start() {
		start = true;
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
		stop = true;
	}
	
	public long getElapsedTime() {
		return endTime - startTime;
	}
	
	
	
}
