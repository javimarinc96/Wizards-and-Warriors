abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getName();
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {


    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean spellPrepared = false;
    
    @Override
    boolean isVulnerable() {
        
        if(this.spellPrepared){
            return false;
        }
        return true;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return this.spellPrepared ? 12 : 3;
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }

}
