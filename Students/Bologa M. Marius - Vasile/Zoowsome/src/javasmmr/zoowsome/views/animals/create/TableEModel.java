package javasmmr.zoowsome.views.animals.create;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import javasmmr.zoowsome.models.employees.Employee;
/**
 * 
 * @author Marius Bologa
 *
 */
public class TableEModel extends AbstractTableModel {
	/**
	 * 
	 */
		private static final String[] columnNames = {"Name", 
				"ID", "Salary" };
		/**
		 * 
		 */
		private final ArrayList<Employee> list;
		/**
		 * 
		 * @param empList
		 *            The array of employees.
		 */
		public TableEModel(final ArrayList<Employee> empList) {
			list = empList;
		}
	/**
	 * 
	 * @param e The animal.
	 */
		public final void addElement(final Employee e) {
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
	 * @param rowIndex Column.
	 * @param columnIndex Row.
	 * @return Value at the specified row and column.
	 */
		public final Object getValueAt(final int rowIndex, 
				final int columnIndex) {
			switch (columnIndex) {
			case 0:
				return list.get(rowIndex).getName();
			case 1:
				return list.get(rowIndex).getId();
			case 2:
				return list.get(rowIndex).getSalary();
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