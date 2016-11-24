package com.example.ipsenspiegel.menuslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity implements ActionMode.Callback {
    TextView hello;
        // Called when the action mode is created; startActionMode() was called
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            // Inflate a menu resource providing context menu items
            MenuInflater inflater = mode.getMenuInflater();
            inflater.inflate(R.menu.contextual_menu, menu);
            return true;
        }

        // Called each time the action mode is shown. Always called after onCreateActionMode, but
        // may be called multiple times if the mode is invalidated.
        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false; // Return false if nothing is done
        }

        // Called when the user selects a contextual menu item
        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            if (item.getItemId() == R.id.Like) {
                Log.i("TAG", "Like! :3");
                mode.finish();
                return true;
            } else if (item.getItemId() == R.id.Dislike) {
                Log.i("TAG", "Dislike ;(");
                mode.finish();
                return true;
            }
            return false;
        }
        // Called when the user exits the action mode

        @Override
        public void onDestroyActionMode(ActionMode mode) {

        }

    }


