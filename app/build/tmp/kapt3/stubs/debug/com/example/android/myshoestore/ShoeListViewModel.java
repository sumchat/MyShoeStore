package com.example.android.myshoestore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/example/android/myshoestore/ShoeListViewModel;", "Landroidx/lifecycle/ViewModel;", "dataSource", "Lcom/example/android/myshoestore/data/DataSource;", "(Lcom/example/android/myshoestore/data/DataSource;)V", "getDataSource", "()Lcom/example/android/myshoestore/data/DataSource;", "shoesLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/android/myshoestore/data/Shoe;", "getShoesLiveData", "()Landroidx/lifecycle/LiveData;", "insertShoe", "", "shoeName", "", "companyName", "shoeDescription", "size", "", "app_debug"})
public final class ShoeListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.myshoestore.data.DataSource dataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.myshoestore.data.Shoe>> shoesLiveData = null;
    
    public ShoeListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.myshoestore.data.DataSource dataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.myshoestore.data.DataSource getDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.myshoestore.data.Shoe>> getShoesLiveData() {
        return null;
    }
    
    public final void insertShoe(@org.jetbrains.annotations.Nullable()
    java.lang.String shoeName, @org.jetbrains.annotations.NotNull()
    java.lang.String companyName, @org.jetbrains.annotations.Nullable()
    java.lang.String shoeDescription, int size) {
    }
}