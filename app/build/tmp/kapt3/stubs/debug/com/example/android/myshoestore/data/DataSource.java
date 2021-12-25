package com.example.android.myshoestore.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\r\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \n*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/android/myshoestore/data/DataSource;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "shoeList", "", "Lcom/example/android/myshoestore/data/Shoe;", "shoesLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "addShoe", "", "shoe", "getRandomShoeImageAsset", "", "()Ljava/lang/Integer;", "getShoeForId", "id", "", "getShoeList", "Landroidx/lifecycle/LiveData;", "updateShoe", "Companion", "app_debug"})
public final class DataSource {
    private final java.util.List<com.example.android.myshoestore.data.Shoe> shoeList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.myshoestore.data.Shoe>> shoesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.android.myshoestore.data.DataSource.Companion Companion = null;
    private static com.example.android.myshoestore.data.DataSource INSTANCE;
    
    public DataSource(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
        super();
    }
    
    public final void updateShoe(@org.jetbrains.annotations.NotNull()
    com.example.android.myshoestore.data.Shoe shoe) {
    }
    
    public final void addShoe(@org.jetbrains.annotations.NotNull()
    com.example.android.myshoestore.data.Shoe shoe) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.android.myshoestore.data.Shoe getShoeForId(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRandomShoeImageAsset() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.myshoestore.data.Shoe>> getShoeList() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/android/myshoestore/data/DataSource$Companion;", "", "()V", "INSTANCE", "Lcom/example/android/myshoestore/data/DataSource;", "getDataSource", "resources", "Landroid/content/res/Resources;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.android.myshoestore.data.DataSource getDataSource(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources resources) {
            return null;
        }
    }
}