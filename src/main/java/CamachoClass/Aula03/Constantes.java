package CamachoClass.Aula03;

public enum Constantes {
    INFLA (1),
    MKTVL (2),
    PRVVL (3);

    private int prior;

    Constantes(int prior) {
        this.prior = prior;
    }

    public int getPrior() {
        return prior;
    }

    public int compare(Constantes c) {
        return c.getPrior() - this.getPrior();
    }

}
