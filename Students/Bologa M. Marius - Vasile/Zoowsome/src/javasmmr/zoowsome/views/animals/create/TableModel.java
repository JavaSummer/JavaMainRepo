package javasmmr.zoowsome.views.animals.create;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import javasmmr.zoowsome.models.animals.Animal;

/**
 * 
 * @author Marius Bologa
 *
 */
public class TableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final String[] columnNames = { "Name", "Number of legs", "Maintenance cost", "Danger percentage" };
	/**
	 * 
	 */
	private final ArrayList<Animal> list;

	/**
	 * 
	 * @param animalList
	 *            The array of animals.
	 */
	public TableModel(final ArrayList<Animal> animalList) {
		list = animalList;
	}

	/**
	 * 
	 * @param e
	 *            The animal.
	 */
	public final void addElement(final Animal e) {
		// Adds the element in the last position in the list
		list.add(e);
		fireTableRowsInserted(list.size() - 1, list.size() - 1);
	}

	/**
	 * 
	 * @return Number of columns.
	 */
	public final int getColumnCount() {
		return columnNames.length;
	}

	/**
	 * 
	 * @return Number of rows.
	 */
	public final int getRowCount() {
		return list.size();
	}

	/**
	 * 
	 * @param rowIndex
	 *            Column.
	 * @param columnIndex
	 *            Row.
	 * @return Value at the specified row and column.
	 */
	public final Object getValueAt(final int rowIndex, final int columnIndex) {
		switch (columnIndex) {
		case 0:
			return list.get(rowIndex).getName();
		case 1:
			return list.get(rowIndex).getNrOfLegs();
		case 2:
			return list.get(rowIndex).getMaintenanceCost();
		case 3:
			return list.get(rowIndex).getDangerPerc();
		default:
			break;
		}
		return null;
	}

	/**
	 * @return The name of the column.
	 * @param col
	 *            The column.
	 */
	public final String getColumnName(final int col) {
		return columnNames[col];
	}

}
