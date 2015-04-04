/*
 * Copyright 2014 Eduardo Barrenechea
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.barrenechea.stickyheaders;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ca.barrenechea.widget.recyclerview.decoration.DividerDecoration;
import ca.barrenechea.widget.recyclerview.decoration.DoubleHeaderDecoration;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView list = (RecyclerView) this.findViewById(R.id.list);

//        StickyTestAdapter adapter = new StickyTestAdapter(this);
        DoubleHeaderTestAdapter adapter = new DoubleHeaderTestAdapter(this);

        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.addItemDecoration(new DividerDecoration(this));
        list.addItemDecoration(new DoubleHeaderDecoration(adapter), 1);
//        list.addItemDecoration(new StickyHeaderDecoration(adapter), 1);

        list.setAdapter(adapter);
    }
}