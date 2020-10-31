package cloudapps.mastermind.distributed;

import cloudapps.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MasterMindServer {
	
	private DispatcherPrototype dispatcherPrototype;
	private LogicImplementationServer logic;

	private MasterMindServer() {
		this.dispatcherPrototype = new DispatcherPrototype();
		this.logic = new LogicImplementationServer();
		this.logic.createDispatchers(this.dispatcherPrototype);
	}

	private void serve() {
		this.dispatcherPrototype.serve();
	}

	public static void main(String[] args) {
		new MasterMindServer().serve();
	}

}
