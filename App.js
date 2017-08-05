import React, {Component} from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity
} from 'react-native';


export default class App extends React.Component {

  render() {
    return (
      <Todo />
    );
  }
}

class Todo extends Component {
  componentWillMount() {
    this.setState({
      inputText: '',
      todos: [],
    })
  }

  addTodo() {
    let todoItem = this.state.inputText
    let todos = this.state.todos
    todos.push(todoItem)
    this.setState({
      inputText: '',
      todos: todos,
    })
  }

  render() {
    return (
      <View style={styles.container}>
        <TextInput
          style={{marginTop:50, height: 40,borderColor: 'gray', borderWidth: 1}}
          onChangeText={(text) => {
            this.setState({inputText: text})
          }}
          value={this.state.inputText}
          />
        <TouchableOpacity onPress={this.addTodo.bind(this)}>
          <Text>
            add Todo
          </Text>
        </TouchableOpacity>
        {
          this.state.todos.map((todoItem, index)=> {
            return (
              <Text key={index}>
                {todoItem}
              </Text>
            )
          })
        }
      </View>
    );
  }
}



const styles = StyleSheet.create({
  app: {
    flex: 1,
    flexDirection: 'column'
  },
  container: {
    height:100
  },
  left: {
    flex: 1,
    backgroundColor: 'red'
  },
  right: {
    flex: 1,
    flexDirection: 'column'
  },
  top: {
    flex: 1,
    backgroundColor: 'blue'
  },
  bottom: {
    flex: 2,
    backgroundColor: 'green'
  },
  navBar: {
    height: 50,
    alignItems: 'center',
    justifyContent: 'center',
    backgroundColor: 'green'
  },
});
