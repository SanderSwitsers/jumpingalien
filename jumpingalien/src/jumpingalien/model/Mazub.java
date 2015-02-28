package jumpingalien.model;

public class Mazub {
	
	public double x_loc;
	public double y_loc;
	public double vx;
	public double vx_start = 1;
	public double vy;
	public double vy_start = 8;
	public double ax;
	public double ax_start = 0.9;
	public double ay = -10;
	public int maxv = 3;
	public double new_vx;
	public int[] dimension;
	public double dt;
	public double delta;
	
	
	
	public Mazub(double x_loc,double y_loc,double vx,double vy,double ax,int maxv,
				int[] dimension){
		this.x_loc=x_loc;
		this.y_loc=y_loc;
		this.vx=vx;
		this.ax=ax;
		
	}
	
	public void advanceTime(){
		new int a = vx + ax*delta;
		
	}
	
	/**
	 * 
	 */
	public void startMoveRight(){
		this.vx=vx_start;
		if (! this.isDucked()){
			this.ax=ax_start;
		}
	}
	
	/**
	 * 
	 */
	public void startMoveLeft(){
		
	}
	
	
	
	/**
	 * 
	 */
	public void endMove(){
		
	}
	
	public boolean isDucked(){
		
	}

}