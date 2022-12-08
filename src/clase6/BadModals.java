package clase6;

public enum BadModals {
    LEVE("3 dias"), NORMAL("1 semana"), GRAVE("1 mes"), MUYGRAVE("1 año");
    private String tiempo;

    BadModals(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }
}
