package bakery.repositories;

import bakery.entities.tables.interfaces.Table;
import bakery.repositories.interfaces.TableRepository;

import java.util.ArrayList;
import java.util.Collection;

public class TableRepositoryImpl implements TableRepository<Table> {
    private Collection<Table> tables = new ArrayList<> ();

    @Override
    public Table getByNumber(int number) {
        Table table = null;
        for(Table out: this.tables){
            if(out.getTableNumber () == number){
                table = out;
                break;
            }
        }
        return table;
    }

    @Override
    public Collection<Table> getAll() {
        return this.tables;
    }

    @Override
    public void add(Table table) {
        this.tables.add (table);
    }
}
