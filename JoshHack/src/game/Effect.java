package game;

public class Effect {
	protected int duration;
	
	public boolean isDone() { return duration < 1; }

	public Effect(int duration){
		this.duration = duration;
	}
	
	public Effect(Effect other){
		this.duration = other.duration; 
	}
	
	public void update(Creature creature){
		duration--;
	}
	
}
