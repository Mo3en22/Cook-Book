package com.training.recipeapp.fragments;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\b\u008d\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u00101J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010l\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010w\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00aa\u0004\u0010\u008f\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0016\u0010\u0090\u0001\u001a\u00030\u0091\u00012\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u00d6\u0001J\n\u0010\u0095\u0001\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010/\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00103R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00103R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00103R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00103R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00103R\u0013\u0010\'\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00103R\u0013\u0010)\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00103R\u0013\u0010+\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00103R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00103R\u0013\u0010-\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00103R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00103R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00103R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00103R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u00103R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00103R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00103R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00103R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00103R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00103R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00103R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00103R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00103R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u00103R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00103R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00103R\u0013\u0010&\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00103R\u0013\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00103R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00103R\u0013\u0010,\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00103R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00103R\u0013\u0010.\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00103R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00103R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00103R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00103R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u00103R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00103R\u0013\u00100\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u00103\u00a8\u0006\u0096\u0001"}, d2 = {"Lcom/training/recipeapp/fragments/Recipe;", "", "idMeal", "", "strMeal", "strMealThumb", "strInstructions", "strIngredient1", "strMeasure1", "strIngredient2", "strMeasure2", "strIngredient3", "strMeasure3", "strIngredient4", "strMeasure4", "strIngredient5", "strMeasure5", "strIngredient6", "strMeasure6", "strIngredient7", "strMeasure7", "strIngredient8", "strMeasure8", "strIngredient9", "strMeasure9", "strIngredient10", "strMeasure10", "strIngredient11", "strMeasure11", "strIngredient12", "strMeasure12", "strIngredient13", "strMeasure13", "strIngredient14", "strMeasure14", "strIngredient15", "strMeasure15", "strIngredient16", "strMeasure16", "strIngredient17", "strMeasure17", "strIngredient18", "strMeasure18", "strIngredient19", "strMeasure19", "strIngredient20", "strMeasure20", "strCategory", "strYoutube", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdMeal", "()Ljava/lang/String;", "getStrCategory", "getStrIngredient1", "getStrIngredient10", "getStrIngredient11", "getStrIngredient12", "getStrIngredient13", "getStrIngredient14", "getStrIngredient15", "getStrIngredient16", "getStrIngredient17", "getStrIngredient18", "getStrIngredient19", "getStrIngredient2", "getStrIngredient20", "getStrIngredient3", "getStrIngredient4", "getStrIngredient5", "getStrIngredient6", "getStrIngredient7", "getStrIngredient8", "getStrIngredient9", "getStrInstructions", "getStrMeal", "getStrMealThumb", "getStrMeasure1", "getStrMeasure10", "getStrMeasure11", "getStrMeasure12", "getStrMeasure13", "getStrMeasure14", "getStrMeasure15", "getStrMeasure16", "getStrMeasure17", "getStrMeasure18", "getStrMeasure19", "getStrMeasure2", "getStrMeasure20", "getStrMeasure3", "getStrMeasure4", "getStrMeasure5", "getStrMeasure6", "getStrMeasure7", "getStrMeasure8", "getStrMeasure9", "getStrYoutube", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Recipe {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String idMeal = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String strMeal = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String strMealThumb = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String strInstructions = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient1 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure1 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient2 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure2 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient3 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure3 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient4 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure4 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient5 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure5 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient6 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure6 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient7 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure7 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient8 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure8 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient9 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure9 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient10 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure10 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient11 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure11 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient12 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure12 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient13 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure13 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient14 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure14 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient15 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure15 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient16 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure16 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient17 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure17 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient18 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure18 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient19 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure19 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strIngredient20 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strMeasure20 = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strCategory = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String strYoutube = null;
    
    public Recipe(@org.jetbrains.annotations.NotNull
    java.lang.String idMeal, @org.jetbrains.annotations.NotNull
    java.lang.String strMeal, @org.jetbrains.annotations.NotNull
    java.lang.String strMealThumb, @org.jetbrains.annotations.NotNull
    java.lang.String strInstructions, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient1, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure1, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient2, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure2, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient3, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure3, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient4, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure4, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient5, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure5, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient6, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure6, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient7, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure7, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient8, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure8, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient9, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure9, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient10, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure10, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient11, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure11, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient12, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure12, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient13, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure13, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient14, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure14, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient15, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure15, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient16, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure16, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient17, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure17, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient18, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure18, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient19, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure19, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient20, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure20, @org.jetbrains.annotations.Nullable
    java.lang.String strCategory, @org.jetbrains.annotations.Nullable
    java.lang.String strYoutube) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIdMeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStrMeal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStrMealThumb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStrInstructions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrIngredient20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrMeasure20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStrYoutube() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.training.recipeapp.fragments.Recipe copy(@org.jetbrains.annotations.NotNull
    java.lang.String idMeal, @org.jetbrains.annotations.NotNull
    java.lang.String strMeal, @org.jetbrains.annotations.NotNull
    java.lang.String strMealThumb, @org.jetbrains.annotations.NotNull
    java.lang.String strInstructions, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient1, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure1, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient2, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure2, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient3, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure3, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient4, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure4, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient5, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure5, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient6, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure6, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient7, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure7, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient8, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure8, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient9, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure9, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient10, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure10, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient11, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure11, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient12, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure12, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient13, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure13, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient14, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure14, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient15, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure15, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient16, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure16, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient17, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure17, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient18, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure18, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient19, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure19, @org.jetbrains.annotations.Nullable
    java.lang.String strIngredient20, @org.jetbrains.annotations.Nullable
    java.lang.String strMeasure20, @org.jetbrains.annotations.Nullable
    java.lang.String strCategory, @org.jetbrains.annotations.Nullable
    java.lang.String strYoutube) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}