package com.training.recipeapp.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/training/recipeapp/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "appDatabase", "Lcom/training/recipeapp/data/AppDatabase;", "(Lcom/training/recipeapp/data/AppDatabase;)V", "favoritesMealsLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/training/recipeapp/data/Meal;", "searchedModelLiveData", "Landroidx/lifecycle/MutableLiveData;", "deletfromfavmeallist", "", "favoriteRecipe", "insertmealtofav", "observSearchedmealsLiveData", "observeFavoriteMealsLiveData", "searchMeals", "searchQuery", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.training.recipeapp.data.AppDatabase appDatabase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.training.recipeapp.data.Meal>> searchedModelLiveData = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<java.util.List<com.training.recipeapp.data.Meal>> favoritesMealsLiveData;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.training.recipeapp.data.AppDatabase appDatabase) {
        super();
    }
    
    public final void searchMeals(@org.jetbrains.annotations.NotNull
    java.lang.String searchQuery) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.training.recipeapp.data.Meal>> observSearchedmealsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.training.recipeapp.data.Meal>> observeFavoriteMealsLiveData() {
        return null;
    }
    
    public final void deletfromfavmeallist(@org.jetbrains.annotations.NotNull
    com.training.recipeapp.data.Meal favoriteRecipe) {
    }
    
    public final void insertmealtofav(@org.jetbrains.annotations.NotNull
    com.training.recipeapp.data.Meal favoriteRecipe) {
    }
}