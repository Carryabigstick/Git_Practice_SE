abstract class Gitperson {

    abstract void fight();
}

class Gitman extends Gitperson
{
    void fight()
    {
        System.out.println("MAN punch!");
        System.out.println("Done");
    }

}

class Gitwoman extends Gitperson
{
    void fight()
    {
        System.out.println("Woman punch!");
    }
}

