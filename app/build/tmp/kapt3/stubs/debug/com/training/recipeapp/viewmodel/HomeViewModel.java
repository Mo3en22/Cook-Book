package com.training.recipeapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/training/recipeapp/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "searchedModelLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/training/recipeapp/data/Meal;", "observSearchedmealsLiveData", "Landroidx/lifecycle/LiveData;", "searchMeals", "", "searchQuery", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.training.recipeapp.data.Meal>> searchedModelLiveData = null;
    
    public HomeViewModel() {
        super();
    }
    
    public final void searchMeals(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.training.recipeapp.data.Meal>> observSearchedmealsLiveData() {
        return null;
    }
}