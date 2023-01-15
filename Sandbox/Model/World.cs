namespace Sandbox.Model;

public sealed class World
{
    private IList<IList<Sand>> _grid;

    public World()
    {
        _grid = new List<IList<Sand>>();
    }
}