public class Birthday {
    private int tag;
    private int monat;

    public Birthday(int tag, int monat){
        setMonat(monat);
        setTag(tag);
    }
    public Birthday(Birthday b){
        this.tag = b.tag;
        this.monat = b.monat;
    }

    public void setMonat(int monat) {
        if (monat > 12 || monat <= 0){
            throw new IllegalArgumentException("Einen gültigen Monatg bitte");
        } else{
            this.monat = monat;
        }
    }

    public void setTag(int tag) {
        switch (monat) {
            case 1, 3, 5, 12, 10, 8, 7 -> {
                if (tag >= 32 || tag <= 0) {
                    throw new IllegalArgumentException("Bitte gültigen Tag im Montasbereich angeben");
                } else this.tag = tag;
            }
            case 2 -> {
                if (tag >= 29 || tag <= 0) {
                    throw new IllegalArgumentException("Bitte gültigen Tag im Montasbereich angeben");
                } else this.tag = tag;
            }
            case 4, 11, 9, 6 -> {
                if (tag >= 31 || tag <= 0) {
                    throw new IllegalArgumentException("Bitte gültigen Tag im Montasbereich angeben");
                } else this.tag = tag;
            }
        }

    }

    @Override
    public String toString() {
        return "Birthday{" +
                "tag=" + tag +
                ", monat=" + monat +
                '}';
    }
}
