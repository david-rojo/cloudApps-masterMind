package cloudapps.mastermind.distributed;

import cloudapps.mastermind.distributed.dispatchers.DispatcherPrototype;

public class MasterMindServer {
	
	private DispatcherPrototype dispatcherPrototype;
	private LogicServer logic;

	private MasterMindServer() {
		this.dispatcherPrototype = new DispatcherPrototype();
		this.logic = new LogicServer(true);
		this.logic.createDispatchers(this.dispatcherPrototype);
	}

	private void serve() {
		this.dispatcherPrototype.serve();
	}

	public static void main(String[] args) {
		new MasterMindServer().serve();
	}

}
