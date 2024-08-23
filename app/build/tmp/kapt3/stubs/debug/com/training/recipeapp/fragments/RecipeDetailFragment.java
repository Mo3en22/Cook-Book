package com.training.recipeapp.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0002J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u001aH\u0002J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u0016H\u0002J\b\u0010+\u001a\u00020\u001aH\u0002J\b\u0010,\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/training/recipeapp/fragments/RecipeDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "apiService", "Lcom/training/recipeapp/fragments/ApiService;", "isInstructionsVisible", "", "recipeImageView", "Landroid/widget/ImageView;", "recipeIngredientsTextView", "Landroid/widget/TextView;", "recipeInstructionsTextView", "recipeNameTextView", "recipeRatingBar", "Landroid/widget/RatingBar;", "recipeTypeTextView", "recipeVideoWebView", "Landroid/webkit/WebView;", "shareIcon", "submitRatingButton", "Landroid/widget/Button;", "extractIngredients", "", "recipe", "Lcom/training/recipeapp/fragments/Recipe;", "fetchRecipeById", "", "id", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setupAndLoadVideo", "videoUrl", "shareRecipe", "showError", "message", "submitRating", "toggleInstructionsVisibility", "Companion", "app_debug"})
public final class RecipeDetailFragment extends androidx.fragment.app.Fragment {
    private com.training.recipeapp.fragments.ApiService apiService;
    private android.widget.ImageView recipeImageView;
    private android.widget.TextView recipeNameTextView;
    private android.widget.TextView recipeInstructionsTextView;
    private android.widget.TextView recipeTypeTextView;
    private android.widget.TextView recipeIngredientsTextView;
    private android.webkit.WebView recipeVideoWebView;
    private android.widget.ImageView shareIcon;
    private android.widget.RatingBar recipeRatingBar;
    private android.widget.Button submitRatingButton;
    private boolean isInstructionsVisible = false;
    @org.jetbrains.annotations.NotNull
    public static final com.training.recipeapp.fragments.RecipeDetailFragment.Companion Companion = null;
    
    public RecipeDetailFragment() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void fetchRecipeById(java.lang.String id) {
    }
    
    private final void setupAndLoadVideo(java.lang.String videoUrl) {
    }
    
    private final java.lang.String extractIngredients(com.training.recipeapp.fragments.Recipe recipe) {
        return null;
    }
    
    private final void toggleInstructionsVisibility() {
    }
    
    private final void shareRecipe() {
    }
    
    private final void submitRating() {
    }
    
    private final void showError(java.lang.String message) {
    }
    
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final com.training.recipeapp.fragments.RecipeDetailFragment newInstance(@org.jetbrains.annotations.NotNull
    java.lang.String recipeId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/training/recipeapp/fragments/RecipeDetailFragment$Companion;", "", "()V", "newInstance", "Lcom/training/recipeapp/fragments/RecipeDetailFragment;", "recipeId", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final com.training.recipeapp.fragments.RecipeDetailFragment newInstance(@org.jetbrains.annotations.NotNull
        java.lang.String recipeId) {
            return null;
        }
    }
}