package impliment;

public class robot {
    arm arm;

    public robot() {
    }

    head head;
    leg leg;

    public robot(impliment.arm arm, impliment.head head, impliment.leg leg) {
        this.arm = arm;
        this.head = head;
        this.leg = leg;
    }

    public impliment.arm getArm() {
        return arm;
    }

    public void setArm(impliment.arm arm) {
        this.arm = arm;
    }

    public impliment.head getHead() {
        return head;
    }

    public void setHead(impliment.head head) {
        this.head = head;
    }

    public impliment.leg getLeg() {
        return leg;
    }

    public void setLeg(impliment.leg leg) {
        this.leg = leg;
    }

    public void action() {
        arm.action();
        leg.action();
        head.action();
    }
}
