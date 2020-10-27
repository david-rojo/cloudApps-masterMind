package cloudapps.mastermind.controllers;

public interface ControllersVisitor {
	
	void visit(StartController startController);
	
	void visit(PlayController proposalController);
	
	void visit(ResumeController continueController);
}
