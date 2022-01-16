package TestCaseExcel;

public class ObjectTest {
	private String tasks;  	
	private double devTotal;	
	private double devPass;
	private double devFail;	
	private double devBlocked; 	
	private double devNotRun; 	
	private double devToDo;
	private double devProgress;
	private double devRate; 
	
	private double qcTotal;	
	private double qcPass;
	private double qcFail;	
	private double qcBlocked; 	
	private double qcNotRun; 	
	private double qcToDo;
	private double qcProgress;
	private double qcRate; 
	
	private double testQC; 
	private double testDev; 
	private double both; 
	
	public ObjectTest() {
		super();
	}

	public ObjectTest(String tasks, double devTotal, double devPass, double devFail, double devBlocked,
			double devNotRun, double devToDo, double devProgress, double devRate, double qcTotal, double qcPass,
			double qcFail, double qcBlocked, double qcNotRun, double qcToDo, double qcProgress, double qcRate,
			double testQC, double testDev, double both) {
		super();
		this.tasks = tasks;
		this.devTotal = devTotal;
		this.devPass = devPass;
		this.devFail = devFail;
		this.devBlocked = devBlocked;
		this.devNotRun = devNotRun;
		this.devToDo = devToDo;
		this.devProgress = devProgress;
		this.devRate = devRate;
		this.qcTotal = qcTotal;
		this.qcPass = qcPass;
		this.qcFail = qcFail;
		this.qcBlocked = qcBlocked;
		this.qcNotRun = qcNotRun;
		this.qcToDo = qcToDo;
		this.qcProgress = qcProgress;
		this.qcRate = qcRate;
		this.testQC = testQC;
		this.testDev = testDev;
		this.both = both;
	}

	public double getTestQC() {
		return testQC;
	}

	public void setTestQC(double testQC) {
		this.testQC = testQC;
	}

	public double getTestDev() {
		return testDev;
	}

	public void setTestDev(double testDev) {
		this.testDev = testDev;
	}

	public double getBoth() {
		return both;
	}

	public void setBoth(double both) {
		this.both = both;
	}

	public double getQcTotal() {
		return qcTotal;
	}

	public void setQcTotal(double qcTotal) {
		this.qcTotal = qcTotal;
	}

	public double getQcPass() {
		return qcPass;
	}

	public void setQcPass(double qcPass) {
		this.qcPass = qcPass;
	}

	public double getQcFail() {
		return qcFail;
	}

	public void setQcFail(double qcFail) {
		this.qcFail = qcFail;
	}

	public double getQcBlocked() {
		return qcBlocked;
	}

	public void setQcBlocked(double qcBlocked) {
		this.qcBlocked = qcBlocked;
	}

	public double getQcNotRun() {
		return qcNotRun;
	}

	public void setQcNotRun(double qcNotRun) {
		this.qcNotRun = qcNotRun;
	}

	public double getQcToDo() {
		return qcToDo;
	}

	public void setQcToDo(double qcToDo) {
		this.qcToDo = qcToDo;
	}

	public double getQcProgress() {
		return qcProgress;
	}

	public void setQcProgress(double qcProgress) {
		this.qcProgress = qcProgress;
	}

	public double getQcRate() {
		return qcRate;
	}

	public void setQcRate(double qcRate) {
		this.qcRate = qcRate;
	}

	public String getTasks() {
		return tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public double getDevTotal() {
		return devTotal;
	}

	public void setDevTotal(double devTotal) {
		this.devTotal = devTotal;
	}

	public double getDevPass() {
		return devPass;
	}

	public void setDevPass(double devPass) {
		this.devPass = devPass;
	}

	public double getDevFail() {
		return devFail;
	}

	public void setDevFail(double devFail) {
		this.devFail = devFail;
	}

	public double getDevBlocked() {
		return devBlocked;
	}

	public void setDevBlocked(double devBlocked) {
		this.devBlocked = devBlocked;
	}

	public double getDevNotRun() {
		return devNotRun;
	}

	public void setDevNotRun(double devNotRun) {
		this.devNotRun = devNotRun;
	}

	public double getDevToDo() {
		return devToDo;
	}

	public void setDevToDo(double devToDo) {
		this.devToDo = devToDo;
	}

	public double getDevProgress() {
		return devProgress;
	}

	public void setDevProgress(double devProgress) {
		this.devProgress = devProgress;
	}

	public double getDevRate() {
		return devRate;
	}

	public void setDevRate(double devRate) {
		this.devRate = devRate;
	}

}
