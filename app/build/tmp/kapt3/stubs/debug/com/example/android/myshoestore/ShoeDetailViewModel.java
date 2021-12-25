package com.example.android.myshoestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/android/myshoestore/ShoeDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/example/android/myshoestore/data/DataSource;", "(Lcom/example/android/myshoestore/data/DataSource;)V", "getShoeForId", "Lcom/example/android/myshoestore/data/Shoe;", "id", "", "saveShoe", "", "_id", "name", "", "companyName", "size", "", "description", "app_debug"})
public final class ShoeDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.android.myshoestore.data.DataSource dataSource = null;
    
    public ShoeDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.myshoestore.data.DataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.android.myshoestore.data.Shoe getShoeForId(long id) {
        return null;
    }
    
    public final void saveShoe(long _id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName, int size, @org.jetbrains.annotations.NotNull()
    java.lang.String description) {
    }
}