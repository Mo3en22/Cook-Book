package com.training.recipeapp.mealadpter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00050\u00050\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/training/recipeapp/mealadpter/Mealadpter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/training/recipeapp/mealadpter/Mealadpter$FavoritMealsAdpterViewholder;", "onItemClick", "Lkotlin/Function1;", "Lcom/training/recipeapp/data/Meal;", "", "(Lkotlin/jvm/functions/Function1;)V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FavoritMealsAdpterViewholder", "app_debug"})
public final class Mealadpter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.training.recipeapp.mealadpter.Mealadpter.FavoritMealsAdpterViewholder> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.training.recipeapp.data.Meal, kotlin.Unit> onItemClick = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.training.recipeapp.data.Meal> diffUtil = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.training.recipeapp.data.Meal> differ = null;
    
    public Mealadpter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.training.recipeapp.data.Meal, kotlin.Unit> onItemClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.training.recipeapp.data.Meal> getDiffer() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.training.recipeapp.mealadpter.Mealadpter.FavoritMealsAdpterViewholder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.training.recipeapp.mealadpter.Mealadpter.FavoritMealsAdpterViewholder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/training/recipeapp/mealadpter/Mealadpter$FavoritMealsAdpterViewholder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/training/recipeapp/databinding/ItemCardBinding;", "(Lcom/training/recipeapp/mealadpter/Mealadpter;Lcom/training/recipeapp/databinding/ItemCardBinding;)V", "getBinding", "()Lcom/training/recipeapp/databinding/ItemCardBinding;", "app_debug"})
    public final class FavoritMealsAdpterViewholder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.training.recipeapp.databinding.ItemCardBinding binding = null;
        
        public FavoritMealsAdpterViewholder(@org.jetbrains.annotations.NotNull
        com.training.recipeapp.databinding.ItemCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.training.recipeapp.databinding.ItemCardBinding getBinding() {
            return null;
        }
    }
}