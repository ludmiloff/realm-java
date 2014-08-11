package io.realm.typed;

import io.realm.Row;

public abstract class RealmObject {

    private Row row;
    long realmAddedAtRowIndex = -1;

    protected Row realmGetRow() {
        return row;
    }

    protected void realmSetRow(Row row) {
        this.row = row;
    }

    @SuppressWarnings("UnusedDeclaration")
    protected void setString(long columnIndex, String argument) {
        row.setString(columnIndex, argument);
    }

    @SuppressWarnings("UnusedDeclaration")
    protected String getString(long columnIndex) {
        return row.getString(columnIndex);
    }
}