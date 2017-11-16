package behavioral.iterator;

public class JavaDevelepor implements Collection {
    String name;
    String[] skills;

    public JavaDevelepor(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        int index;

        public SkillIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            if (index < skills.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
